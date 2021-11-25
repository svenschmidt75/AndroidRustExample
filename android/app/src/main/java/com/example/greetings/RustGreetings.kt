class RustGreetings {
    fun sayHello(to: String): String {
        val result = greeting(to)
        return result
    }

    companion object {
        private external fun greeting(pattern: String): String
    }
}