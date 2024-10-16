import java.io.File

fun main() {
    try {
        val directory = "C:\\1"
        val file = File(directory)

        if (file.exists() && file.isDirectory) {
            // Используем ProcessBuilder для открытия проводника
            val processBuilder = ProcessBuilder("explorer.exe", directory)
            processBuilder.start()
            println("Директория $directory успешно открыта.")
        } else {
            println("Директория $directory не существует.")
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
