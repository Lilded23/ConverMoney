# Conversor de Monedas

Este es un proyecto de conversor de monedas que te permite convertir montos de una moneda a otra utilizando un API de tasas de cambio.

## Instrucciones de Ejecución

1. Clona el repositorio a tu entorno de desarrollo local.
2. Asegúrate de tener configuradas las dependencias necesarias.
3. Ejecuta el programa `Main.java` para iniciar el conversor de monedas.

## Características Principales

- Conversión bidireccional entre USD y otras monedas (ARS, BOB, BRL, CLP).
- Utiliza el API de ExchangeRate para obtener las tasas de cambio en tiempo real.
- Interfaz de línea de comandos con menús para seleccionar la conversión deseada.
- Posibilidad de ingresar el monto a convertir y mostrar el resultado en ambas direcciones.

## Archivos del Proyecto

- `Main.java`: Punto de entrada del programa que maneja la lógica de conversión.
- `Conver.java`: Clase que contiene la lógica de conversión de monedas.
- `HttpClientService.java`: Clase para realizar solicitudes HTTP al API de ExchangeRate.

## Configuración de API Key

- En la clase `HttpClientService`, asegúrate de reemplazar `apiKey` por tu propia clave de API de ExchangeRate.

## Notas

- Este proyecto utiliza Java y librerías como Gson y HttpClient para la comunicación con el API.
- Verifica tu conexión a Internet para garantizar el acceso al API de ExchangeRate.

---
