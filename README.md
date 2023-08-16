## Consumo Librería PGE-Client para mtom

- Configuración dominio para envío

/ejemploclientemtom-version_axi2_pura/src/main/java/uy/gub/agesic/cliente/mtom/MTOMServiceClientApplication.java

- Configuración consumo servicio

/ejemploclientemtom-version_axi2_pura/conector-pge.properties

java -jar ./target/ejemplo-cliente-mtom-1.0.0.jar ./archivos/archivo48M.fiee

- Build

mvn clean package o mvnw clean package si es windows.

- Run

para ejecutarlo, desde la carpeta raíz del proyecto ejecutar java -jar target\ejemplo-cliente-mtom-1.0.0.jar NOMBRE_ARCHIVO

donde NOMBRE_ARCHIVO es la ruta y el nombre del archivo a enviar, ejemplo

java -jar target\ejemplo-cliente-mtom-1.0.0.jar archivos\nombrearchivo.txt