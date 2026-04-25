## SISTEMA DE GESTION DE BIBLIOTECA UNIVERSITARIA
Trabajo realizado para la catedra de PROGRAMACION 3 por los estudiantes Rivero Sanagua Eduardo Javier - EISI 1437 y Fuentes Tobarez Gustavo David -EISI1000 .
Con este sistema buscamos aprender mediante la aplicación práctica los Pilares de la Programación Orientada a Objetos (POO) con el lenguaje JAVA

---

### Arquitectura Lógica y Operativa.
Para que el software sea eficiente, se seleccionaron estructuras específicas de Java según la necesidad de acceso :
- Inventario Dinámico (ArrayList): Administra el catálogo bibliográfico permitiendo un crecimiento flexible y recorridos secuenciales para búsquedas por título .
- Acceso Instantáneo de Usuarios (HashMap): Utiliza el legajo estudiantil como clave única para realizar búsquedas directas sin necesidad de iterar sobre toda la base de datos . 
- Integridad de Transacciones (HashSet): Garantiza la unicidad de los préstamos activos; esto se logra mediante la lógica de comparación personalizada en los métodos equals() y hashCode() . 
- Reglas de Negocio e Inteligencia del SistemaProtocolo de Adjudicación: El sistema audita la disponibilidad del ejemplar y el historial del alumno antes de confirmar un retiro .
- Restricción de Cupos: Se limita a un máximo de tres libros por usuario para asegurar una distribución equitativa de los recursos .
- Penalización Recursiva: Se implementó un algoritmo de recursión para calcular multas por morosidad, sumando un 1% diario con un tope de seguridad de 30 iteraciones para proteger la memoria del sistema . 
 ---
 
### Manejo de Errores.
El software implementa un diseño de excepciones para comunicar eventos específicos del dominio de la biblioteca :
- LibroNoDisponibleException: Activada si el ejemplar ya está bajo préstamo.
- EstudianteNoEncontradoException: Disparada si el legajo no figura en el padrón.
- LimitePrestamosExcedidoException: Notificada cuando un socio intenta superar su capacidad de retiro. 

