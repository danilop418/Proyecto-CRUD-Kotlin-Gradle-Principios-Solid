
# Resumen del Proyecto - CRUD-Kotlin-Gradle-Principios-Solid

# ¿Qué es el proyecto?
Un sistema para gestionar estudiantes usando Clean Architecture con patrón MVVM, que es la misma arquitectura que usa Android. Las 3 capas principales:

# 1. Domain
Student: El modelo de datos (expediente + nombre) StudentRepository: Interfaz que dice "cómo" guardar datos SaveStudentUseCase: La lógica de negocio para guardar estudiantes

# 2. Data
StudentDataRepository: Coordina dónde guardar los datos

# 3 tipos de almacenamiento:
Memoria: Rápido pero se pierde al cerrar XML
Archivo estructurado en el disco duro (como guardar en una carpeta) 
API: Base de datos remota en internet (como subir a la nube)

# 3. Presentation - La interfaz
StudentView: Lo que ve el usuario StudentViewModel: Intermediario entre la vista y la lógica

# ¿Relación con Android?
El proyecto usa exactamente los mismos patrones que Android. 
Google recomienda esta arquitectura porque sigue principios SOLID, especialmente: Cada clase tiene una responsabilidad Las capas están separadas Fácil de mantener y testear

# Flujo completo:
Usuario interactúa → StudentView Vista comunica → StudentViewModel ViewModel llama → SaveStudentUseCase UseCase usa → StudentRepository Repository decide → guardar en memoria + XML + API
