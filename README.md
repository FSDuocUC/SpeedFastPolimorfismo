# SpeedFastPolimorfismo

Proyecto universitario en Java que implementa conceptos de **programación orientada a objetos** aplicados a la gestión de pedidos de la empresa ficticia *SpeedFast*.  
Este repositorio funciona como una **bitácora de mejoras**, mostrando la evolución del proyecto semana a semana.

---

## Semana 1 – Implementación inicial
En la primera semana se desarrolló la base del proyecto:
- Creación de clases simples para modelar pedidos.
- Atributos básicos como `idPedido`, `direccionEntrega` y `distanciaKm`.
- Métodos iniciales para mostrar información de los pedidos.
- Aplicación de conceptos de **encapsulación** y **herencia básica**.

**Objetivo:** Sentar las bases del proyecto con clases funcionales y estructura clara.

---

## Semana 2 – Clase abstracta y polimorfismo
En la segunda semana se refactorizó el proyecto para hacerlo más robusto y reutilizable:
- Se creó la clase **abstracta `Pedido`** con atributos comunes y un método abstracto `calcularTiempoEntrega()`.
- Se implementaron tres subclases con lógica diferenciada:
  - `PedidoComida`: tiempo = 15 min + 2 min/km.  
  - `PedidoEncomienda`: tiempo = 20 min + 1.5 min/km (ajustado a entero).  
  - `PedidoExpress`: tiempo = 10 min base, +5 min si la distancia > 5 km.  
- Se agregó el método `mostrarResumen()` en la clase abstracta para imprimir datos básicos.
- Se creó la clase `Main` en el paquete `ui` para instanciar objetos de cada tipo y mostrar resultados comparativos.

**Conceptos aplicados:**
- **Abstracción**: Definición de una clase abstracta con métodos comunes.  
- **Herencia**: Subclases que extienden la clase `Pedido`.  
- **Polimorfismo**: Implementación distinta de `calcularTiempoEntrega()` en cada subclase.  

---

## Estructura del proyecto
- **src/model/**  
  - `Pedido` (abstracta)  
  - `PedidoComida`  
  - `PedidoEncomienda`  
  - `PedidoExpress`  
- **src/ui/**  
  - `Main` (punto de entrada del programa)

---

## Ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/FSDuocUC/SpeedFastPolimorfismo.git
