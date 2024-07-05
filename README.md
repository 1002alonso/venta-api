# Proyecto Spring Boot 3 - venta-api CRUD API

## Descripción

Este proyecto es una API RESTful construida con Spring Boot 3, que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar una entidad de ejemplo (por ejemplo, "productos"). El propósito de este proyecto es demostrar cómo se puede crear una aplicación básica con Spring Boot 3, junto con las mejores prácticas para estructurar el código y gestionar las dependencias. Con una arquitectura hexagonal

## Características

- Creación de nuevos productos.
- Recuperación de la lista de productos.
- Recuperación de un producto por ID.
- Actualización de productos existentes.
- Eliminación de productos.

## Requisitos

- Java 17 o superior
- Gradlew 8 o superior
- MySQL 

## Configuración del Entorno

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/1002alonso/venta-api.git
   cd venta-api

2. **Base de datos**

    Dentro del proyecto en el directorio data, se encuentra el script para ejecutarlo en el cliente de mysql de su preferencia, cambiar las credenciales de acceso a la base de datos en el archivo application.properties
    