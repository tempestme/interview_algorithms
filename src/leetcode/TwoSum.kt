fun main(){
    foundSum(6, arrayOf(3,2,4))
}

fun foundSum(target:Int, nums:Array<Int>):IntArray{
    val set = nums.toSet()
    nums.forEachIndexed(){ index: Int, integer: Int ->
        if (set.contains(target-integer)){
            nums.forEachIndexed(){ index2: Int, integer2: Int ->
                println("$integer $integer2")
                if (integer+integer2==target&&index!=index2)return intArrayOf(index,index2)
            }
        }
    }
    return intArrayOf()
}