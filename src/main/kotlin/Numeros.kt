class Numeros(val arrayNumeros:Array<Int>) {

    fun suma() = arrayNumeros.sum()
    fun mayor() = arrayNumeros.maxOrNull()
    fun menor() = arrayNumeros.minOrNull()
    fun ordenados() = arrayNumeros.sortedArray()
}