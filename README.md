Aquí está la información proporcionada por el usuario:

# Catálogo de Ropa — Figma a Android

## Descripción del proyecto

Este proyecto es una copia de la interfaz de una tienda de ropa infantil que fue diseñada antes en **Figma** y después se hizo en **Android Studio** con Java y XML.

El objetivo principal es pasar el diseño visual a una aplicación Android, manteniendo sus componentes, colores, tipografías, tamaños y recursos gráficos.

El proyecto se hizo como una práctica del Ciclo Formativo de Grado Superior en Desarrollo de Aplicaciones Multiplataforma (DAM).

## Tecnologías utilizadas

- **Figma:** diseño de la interfaz y extracción de datos con Dev Mode.

- **Android Studio:** creación y ejecución de la aplicación.

- **Java:** código de la actividad y manejo de productos.

- **XML:** creación de layouts, estilos y recursos.

- **Material Design 3:** sistema de diseño usado en la interfaz.

- **Git y GitHub:** control de versiones del proyecto.

## Funcionalidades implementadas

La pantalla de Catálogo incluye:

- Barra de búsqueda con iconos personalizados.

- Encabezado de la sección Catálogo.

- Filtros visuales de edad/talla, color, precio y ordenación.

- Cuadrícula de productos mediante `RecyclerView` y `GridLayoutManager`.

- Tarjetas con fotografías, nombres, precios e iconos de favoritos.

- Barra de navegación inferior con Inicio, Catálogo y Perfil.

**Nota:** la implementación se centra solo en la apariencia visual. Los filtros, favoritos y navegación todavía no tienen funcionalidad completa.

## Recursos y diseño

Para lograr mayor fidelidad al prototipo original, se usaron estos recursos:

- Colores extraídos desde Figma y almacenados en `colors.xml`.

- Tipografías Roboto e Inter, según las especificaciones del diseño.

- Estilos de texto reutilizables definidos en `styles.xml`.

- Fotografías convertidas de PNG a WebP.

- Iconos exportados desde Figma e importados como VectorDrawable.

Esta organización facilita el mantenimiento y permite cambiar la apariencia sin modificar cada componente por separado.

## Proceso de desarrollo

El trabajo se ha dividido en las siguientes fases:

1. Análisis de la pantalla de Figma y su estructura de componentes.

2. Preparación del archivo en Figma para desarrollo.

3. Extracción de colores, tipografías y dimensiones.

4. Creación y configuración del proyecto Android.

5. Organización de los recursos mediante archivos XML.

6. Importación y optimización de imágenes e iconos.

7. Implementación de la pantalla Catálogo utilizando Java y XML.

8. Compilación y comprobación visual en un emulador Android.

## Capturas del proyecto

En este apartado se pueden colocar dos imágenes para comparar el diseño original con la aplicación desarrollada.

**Diseño original en Figma**

[Insertar captura del Catálogo en Figma]

**Resultado en Android Studio**

[Insertar captura del Catálogo en el emulador]

## Ejecución

Para ejecutar el proyecto:

1. Clonar o descargar el repositorio.

2. Abrirlo desde Android Studio.

3. Esperar a que Gradle sincronice las dependencias.

4. Seleccionar un emulador Android compatible.

5. Ejecutar la aplicación mediante **Run**.

El proyecto utiliza Java, XML y una configuración con `minSdk 28`.

## Autor

Proyecto académico hecho por un estudiante del Ciclo Formativo de Grado Superior en Desarrollo de Aplicaciones Multiplataforma (DAM).

## Estado del proyecto

Interfaz principal de Catálogo implementada. Las funciones interactivas adicionales siguen pendientes de desarrollo.
