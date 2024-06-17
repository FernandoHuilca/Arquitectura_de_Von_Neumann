# Modelo de John Von Neumann.

Este repositorio contiene un programa que simula el funcionamient del modelo de Von Neumann, una de las bases fundamentales de la arquitectura de las computadoras modernas, así como una explicación del funcionamiento del CPU (Unidad Central de Procesamiento).

![image](https://github.com/FernandoHuilca/Arquitectura_de_Von_Neumann/assets/134117009/9a646692-fa8b-449e-81c4-cd2941c82522)


## Tabla de Contenidos

- [Introducción](#introducción)
- [Componentes del Modelo de Von Neumann](#componentes-del-modelo-de-von-neumann)
- [Funcionamiento del Modelo de Von Neumann](#funcionamiento-del-modelo-de-von-neumann)
- [Características Claves del Modelo de Von Neumann](#características-claves-del-modelo-de-von-neumann)
- [Ventajas y Desventajas del Modelo de Von Neumann](#ventajas-y-desventajas-del-modelo-de-von-neumann)

## Introducción

El modelo de Von Neumann, también conocido como arquitectura de Von Neumann, es un diseño conceptual para una computadora digital propuesto por el matemático y físico John von Neumann en la década de 1940. Este modelo es la base de la mayoría de las computadoras modernas y se caracteriza por una estructura clara y lógica para la ejecución de programas.

## Componentes del Modelo de Von Neumann

1. **Unidad Central de Procesamiento (CPU)**: Encargada de ejecutar las instrucciones del programa. La CPU se divide en:
   - **Unidad de Control (CU)**: Dirige las operaciones de la computadora, decodificando las instrucciones y controlando el flujo de datos entre los demás componentes.
   - **Unidad Aritmético-Lógica (ALU)**: Realiza operaciones aritméticas y lógicas sobre los datos.

2. **Memoria**: Almacena tanto los datos como las instrucciones del programa. Es una característica clave del modelo de Von Neumann, ya que no hace distinción entre ambos tipos de información.

3. **Dispositivos de Entrada y Salida (I/O)**: Permiten la comunicación entre la computadora y el mundo exterior. Los dispositivos de entrada incluyen teclados, ratones y escáneres, mientras que los dispositivos de salida incluyen monitores, impresoras y altavoces.

4. **Bus**: Un sistema de comunicación que transfiere datos entre la CPU, la memoria y los dispositivos de I/O. Los buses pueden ser de diferentes tipos, como el bus de datos, el bus de direcciones y el bus de control.


<table>
  <tr>
    <td><img src="https://github.com/FernandoHuilca/Aquitectura_de_Von_Neumann/assets/134117009/8bf4cea9-4b98-4b67-a7c7-b30667f3df57"></td>
    <td><img src="https://github.com/FernandoHuilca/Aquitectura_de_Von_Neumann/assets/134117009/8168c9f6-fd3a-4223-be8f-9d22f44e2f4f" alt="image2"></td>
  </tr>

</table>

## Funcionamiento del Modelo de Von Neumann

El modelo de Von Neumann sigue un ciclo básico de operación, conocido como el ciclo de instrucción, que incluye los siguientes pasos:

1. **Fetch (Buscar)**: La CPU recupera una instrucción de la memoria.
2. **Decode (Decodificar)**: La unidad de control interpreta la instrucción.
3. **Execute (Ejecutar)**: La ALU realiza la operación indicada por la instrucción.
4. **Store (Almacenar)**: Los resultados de la operación se almacenan en la memoria o en los registros.

## Características Claves del Modelo de Von Neumann

1. **Memoria Unificada**: En el modelo de Von Neumann, la misma memoria se utiliza para almacenar tanto los datos como las instrucciones del programa. Esto simplifica el diseño de la computadora y facilita la programación.

2. **Secuencialidad**: Las instrucciones se ejecutan de manera secuencial, una tras otra, a menos que se especifique lo contrario mediante instrucciones de control de flujo (como saltos o bucles).

3. **Flexibilidad**: La capacidad de tratar las instrucciones como datos permite que los programas puedan modificarse a sí mismos o generar nuevas instrucciones durante su ejecución.

## Ventajas y Desventajas del Modelo de Von Neumann

**Ventajas:**
- Simplicidad en el diseño y la implementación de computadoras.
- Flexibilidad en la programación y ejecución de programas.
- Uso eficiente de la memoria al no distinguir entre datos e instrucciones.

**Desventajas:**
- **Cuello de Botella de Von Neumann**: La limitación en la velocidad de transferencia de datos entre la CPU y la memoria puede afectar el rendimiento del sistema.
- **Vulnerabilidad a Errores**: Dado que las instrucciones se tratan como datos, es posible que los errores en los datos resulten en la ejecución de instrucciones incorrectas.

**Sobre el proyecto en código:**
El diagrama de clases del código es el siguietne (ejemplo adicional): 
<table>
  <tr>
    <td><img src="https://github.com/FernandoHuilca/Arquitectura_de_Von_Neumann/assets/134117009/89d3e955-9df6-49b1-80a6-e089d0d61023"></td>
    <td><img src="https://github.com/FernandoHuilca/Arquitectura_de_Von_Neumann/assets/134117009/d947b0eb-36a1-49e5-968a-e9d4cce8fdc5" alt="image2"></td>
  </tr>

</table>



---

_**Ingeniería de Software** | **Escuela Politécnica Nacional** | **Fernando Huilca**_
