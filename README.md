TAREA: Implementar un nuevo campo de factor de autenticación
CONTEXTO: Estamos trabajando en un proyecto Spring Boot con arquitectura hexagonal
que maneja transacciones.

REQUISITOS DETALLADOS:

1. MODIFICACIÓN DEL MODELO DE DATOS:

Agregar campo 'authenticationFactor' (String) al objeto TransactionRequest en:
     - Archivo: transaction.yml
     - Restricciones:
       - No nulo (@NotNull)
       - Longitud máxima: 10 caracteres (@Size(max = 10))
       - Solo letras (@Pattern(regexp = "^[a-zA-Z]+$"))
       - Descripción: "Factor de doble autenticación"

Agregar el mismo campo a la clase de dominio 'Transaction'

2.ACTUALIZACIÓN DE CAPA DE PERSISTENCIA:

- Actualizar el repositorio para soportar el nuevo campo
- Implementar un método en TransactionRepositoryImpl que:
  - Nombre: findByAuthenticationFactor
  - Parámetro: String authenticationFactor
  - Retorno: Transaction
  - Anotación: @Transactional(readOnly = true)

3.ACTUALIZACIÓN DE CAPA DE PERSISTENCIA:

4.MODIFICACIÓN DEL CONTROLADOR:

- Actualizar el controlador para manejar el nuevo campo

5.CONSIDERACIONES:

- Mantener la arquitectura hexagonal existente
- Seguir principios de código seguro (validación de entrada, prevención de inyección)
- Asegurar que todos los cambios sean consistentes a través de todas las capas

ENTREGABLES ESPERADOS:

- Código actualizado que cumpla con todos los requisitos
- Confirmación de que el proyecto compilará y funcionará correctamente
- Identificación de posibles puntos adicionales a considerar
