create database Yordan;
use Yordan;


--Ejercicio 1

CREATE TABLE Estudiantes (
    IdEstudiante INT PRIMARY KEY,
    NombreEstudiante VARCHAR(100)
);



CREATE TABLE Profesores (
    IdProfesor INT PRIMARY KEY,
    NombreProfesor VARCHAR(100)
);


CREATE TABLE Cursos (
    IdCurso INT PRIMARY KEY,
    NombreCurso VARCHAR(100),
    IdProfesor INT,
    FOREIGN KEY (IdProfesor) REFERENCES Profesores(IdProfesor)
);


CREATE TABLE Matriculas (
    IdEstudiante INT,
    IdCurso INT,
    PRIMARY KEY (IdEstudiante, IdCurso),
    FOREIGN KEY (IdEstudiante) REFERENCES Estudiantes(IdEstudiante),
    FOREIGN KEY (IdCurso) REFERENCES Cursos(IdCurso)
);

SELECT e.NombreEstudiante ,c.NombreCurso,p.NombreProfesor
FROM Estudiantes e
JOIN Matriculas m ON e.IdEstudiante= m.IdEstudiante
JOIN Cursos c On c.IdCurso=m.IdCurso
JOIn Profesores p ON c.IdProfesor= p.IdProfesor;



--ejercicio 2
--table original
--IdVenta		Fecha	Cliente	DirecciónCliente	Producto	Precio
--1		2025-01-10	Juan Pérez	Lima	Laptop	3500
--1		2025-01-10	Juan Pérez	Lima	Mouse	50
--2		2025-01-12	María López	Arequipa	Teclado	120


select * from Ventas; 

CREATE TABLE  Ventas   (
idVenta int primary key identity(1,1),
idCliente int,
fecha date,
FOREIGN KEY (idCliente) REFERENCES Clientes(idCliente)

);

CREATE TABLE  Clientes  (
idCliente int primary key identity(1,1),
nombre varchar(40),
direccion varchar(70)

);

CREATE TABLE  Productos  (
idProducto  int primary key identity(1,1),
nombre varchar(40),
precio decimal

);

CREATE TABLE  DetalleVenta  (
idVenta int,
idProducto int,
PRIMARY KEY (idVenta,idProducto),
FOREIGN KEY(idVenta) REFERENCES Ventas(idVenta),
FOREIGN KEY (idProducto) REFERENCES Productos(idProducto)

);


SELECT v.idVenta AS 'Nr. Factura', 
c.nombre AS 'Nom. Cliente',
p.nombre AS 'Nom. Producto',
v.fecha
FROM Ventas v
JOin  Clientes c ON v.idCliente=c.idCliente
JOIN DetalleVenta d On v.idVenta=d.idVenta
JOIN Productos p ON d.idProducto= p.idProducto;


--Ejercicio 3
--tabla
--IdPrestamo	FechaPrestamo	Libro	Autor	Editorial	Usuario
----1	2025-03-01	SQL Básico	Pedro Torres	Alfa	Juan
----2	2025-03-02	SQL Avanzado	Pedro Torres	Alfa	María

--•	¿Un autor puede tener varios libros? 
-- si 
--•	¿Una editorial publica varios libros? 
--si
--•	¿Qué dependencias transitivas existen? 
--ninguna  todo esta en la tabla 

-- 1. Usuarios (Independiente)
CREATE TABLE Usuarios (
    idUsuario int primary key identity(1,1),
    nombre varchar(50)
);

-- 2. Autores (Independiente)
CREATE TABLE Autores (
    idAutor int primary key identity(1,1),
    nombre varchar(50)
);

-- 3. Editoriales (¡Ahora es independiente!)
CREATE TABLE Editoriales (
    idEditorial int primary key identity(1,1),
    nombre varchar(50)
);

-- 4. Libros (Depende de Autores y de Editoriales)
CREATE TABLE Libros (
    idLibro int primary key identity(1,1),
    idAutor int,
    idEditorial int, -- <--- ¡La FK va aquí!
    titulo varchar(50),
    FOREIGN KEY (idAutor) REFERENCES Autores(idAutor),
    FOREIGN KEY (idEditorial) REFERENCES Editoriales(idEditorial)
);

-- 5. Prestamo (Tabla intermedia / Muchos a Muchos)
CREATE TABLE Prestamo (
    idLibro int,
    idUsuario int,
    fecha date,
    PRIMARY KEY (idLibro, idUsuario),
    FOREIGN KEY (idLibro) REFERENCES Libros(idLibro), -- Corregido a 'Libros'
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

--ejercicio 4
--tabla 
--IdEmpleado	NombreEmpleado	IdDepartamento	NombreDepartamento	Gerente
--1	Juan	10	Sistemas	Carlos
--2	María	10	Sistemas	Carlos
--3	Pedro	20	Ventas	Ana

--Dependencias
--IdEmpleado → NombreEmpleado, IdDepartamento

--IdDepartamento → NombreDepartamento, Gerente
--
--Pregunta
--¿Por qué esta tabla viola la 3FN?
--existe dependencia de columnas cosa que en la 3fn no es lo  buscado





