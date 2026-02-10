- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- LECTURA Y ESCRITURA DE FICHEROS

Procesador de Productos CSV

Programa en Java que lee un archivo de texto estructurado y formatea la información para mostrar una lista de productos con sus respectivos precios.

🚀 Funcionalidades
- Lectura Estructurada: Procesa el archivo productos.txt interpretando cada línea como un registro de datos.
- Parseo de Delimitadores: Utiliza el carácter ; para separar el nombre del producto del valor numérico del precio.
- Conversión de Tipos: Transforma cadenas de texto en valores decimales (double) para representar precios de forma precisa.
- Presentación Formateada: Genera una salida visual clara en consola, añadiendo el símbolo de moneda y separadores visuales.

🛠️ Estructura técnica
- El programa utiliza técnicas de manipulación de cadenas y gestión de flujos:
- String.split(";"): Método fundamental para tokenizar la información de cada línea.
- Double.parseDouble(): Convierte la representación textual del precio en un tipo de dato numérico.
- BufferedReader: Garantiza una lectura de alto rendimiento del archivo de texto.
- Validación de Datos: Comprueba la integridad de cada línea (datos.length == 2) antes de intentar procesarla para evitar errores de ejecución.
