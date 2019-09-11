class EasiestKt {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            var n : Int = readLine()!!.toInt()
            if(n == 0) 
                break
            var p = 11
            while(true) {
                if(sumOfDigits(n*p) == sumOfDigits(n)) {
                    println(p)
                    break;
                }
                p++
            }
        }
    }

    fun sumOfDigits(sumInput: Int): Int {
        var tot = 0
        var sum = sumInput
        while(sum > 0) {
            tot = tot + sum % 10
            sum = sum / 10
        }
        return tot
    }
}