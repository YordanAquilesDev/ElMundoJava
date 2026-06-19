.
USE master;
--PRACTICA 1 CRECION DE LOGINS	
-- creacion de un Login
 CREATE LOGIN Yordan
 WITH PASSWORD='Yordan12';

 --creacion de Login
 CREATE LOGIN Aquiles
 WITH PASSWORD ='Aquiles12';

 --crrecion de login
 CREATE LOGIN  Cespedes
 WITH PASSWORD = 'Cespedes12';

--Verificacion
SELECT name
FROM sys.server_principals
WHERE name='Yordan'

SELECT * FROM sys.server_principals;

SELECT * FROM sys.server_principals
WHERE create_date BETWEEN '2026-06-19' and '2026-06-30';

--	PRACTICA 2 CERACION DE USUARIOS
USE ColegioDB;

-- creacion
CREATE USER Yordan
FOR LOGIN Yordan;

CREATE USER Aquiles
FOR LOGIN Aquiles;

CREATE USER Cespedes
FOR LOGIN Cespedes;

SELECT  name
FROM sys.database_principals
WHERE name='Yordan';

SELECT  * FROM sys.database_principals;

SELECT * FROM sys.database_principals
WHERE create_date BETWEEN '2026-06-19' and '2026-06-30';


--PRACTICA 3 ASIGANR PERMISOS DE LECTURA
USE ColegioDB;
--lectores
ALTER ROLE db_datareader
ADD MEMBER Yordan;

ALTER ROLE db_datareader
ADD MEMBER Aquiles;

ALTER ROLE db_datareader
ADD MEMBER Cespedes;

--verificacion
SELECT 
DP1.name AS Usuario,
DP2.name AS Rol
FROM sys.database_role_members DRM
INNER JOIN sys.database_principals DP1
ON DRM.member_principal_id=DP1.principal_id
INNER JOIN sys.database_principals DP2
ON DRM.role_principal_id=DP2.principal_id;



--PRACTICA 4 CREAR USUARIO CON LECTURA Y ESCRITURA
 USE master;

 CREATE LOGIN Quiroz
 WITH PASSWORD ='Quiroz12';

 USE ColegioDB;


 CREATE USER Quiroz
 FOR LOGIN Quiroz;

 --lectura
 ALTER ROLE db_datareader
 ADD MEMBER Quiroz;
 --escritura
 ALTER ROLE db_datawriter
 ADD MEMBER Quiroz;


 --verificacion
 SELECT 
DP1.name AS Usuario,
DP2.name AS Rol
FROM sys.database_role_members DRM
INNER JOIN sys.database_principals DP1
ON DRM.member_principal_id=DP1.principal_id
INNER JOIN sys.database_principals DP2
ON DRM.role_principal_id=DP2.principal_id
WHERE DP1.name='AdminColegio2';



--PRACTICA 5 CREAR UN ADMINISTRASOR DE DASE DE DATOS
USE master;
--creams el login
 CREATE LOGIN AdminColegio2
 WITH PASSWORD = 'Admi123';

 USE ColegioDB;
 -- creamos el usuario con el login
 CREATE USER AdminColegio2
 FOR LOGIN AdminColegio2;

 -- asignamos su rol de 
 --administrador de base de datos
 ALTER ROLE db_owner
 ADD MEMBER AdminColegio2;

 --verificamos
  SELECT 
DP1.name AS Usuario,
DP2.name AS Rol
FROM sys.database_role_members DRM
INNER JOIN sys.database_principals DP1
ON DRM.member_principal_id=DP1.principal_id
INNER JOIN sys.database_principals DP2
ON DRM.role_principal_id=DP2.principal_id
WHERE DP1.name='AdminColegio2';

---PRCTICA 6 CAMBIAR LA CONTRASEÑA
ALTER LOGIN Yordan
WITH PASSWORD='NuevoPaswword';

--PRACTICAB DESHABILITAR Y HABILITAR LOGIN
--desabilitar
ALTER LOGIN Yordan DISABLE;
--habilitar
ALTER LOGIN Yordan ENABLE;

--verificacion
SELECT name,is_disabled
FROM sys.sql_logins;

--PRACTICA 8 ELIMINAR  USUARIO Y LOGIN
USE ColegioDB;

-- eliminar el usuarios
DROP USER Yordan;

-- usamos master
USE master;

--eliminamos el Login
DROP LOGIN Yordan;

--verificacion
SELECT name 
FROM sys.server_principals
WHERE name='Yordan';

-- PRACTICA 9 CONSULTAR USUARIOS DE UNA BASE DE DATOS

SELECT name,
type_desc,
create_date
FROM sys.database_principals
WHERE type IN ('S','N')
ORDER BY name;

--PRACTICA 10 CONSULTAR LOGINS DEL SERVIDOR

SELECT name,
type_desc,
create_date
FROM sys.server_principals
WHERE type IN ('S','U')
ORDER BY name;

--CASO PRACTICA
--la db AcademiaDB nesecita implementar seguridad para dos tipos de usuarios:
-- Profesor
--Alumno
--REQUERIMIENTOS
 -- crear la base de datos AcademiaDB
 -- crear los Logins 
 --       Profesor1
 --       Alumno1
 --Crear los usuarios correspondientes
 --ASIGNANR PERSIMSOS
 --  Profesor1 --->Lectura y Escritura
 --  Alumno1----->Lectura

 CREATE DATABASE AcademiaDB;

 USE AcademiaDB;
 CREATE LOGIN Profesor1
 WITH PASSWORD ='Profesor1';

 CREATE LOGIN Alumno1
 WITH PASSWORD='Alumno1';

 CREATE USER Profesor1
 FOR LOGIN Profesor1;

 CREATE USER Alumno1
 FOR LOGIN Alumno1;

 ALTER ROLE db_datawriter
 ADD MEMBER Profesor1;

 ALTER ROLE db_datareader
 ADD MEMBER Profesor1;

 ALTER ROLE db_datareader
 ADD MEMBER Alumno1;













