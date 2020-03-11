class SimpleSpice () {
   private var spiceName: String = "curry"

   private var spiceLevel = "mild"

   private val heat: Int
      get() = if(spiceLevel=="mild") 5 else 1

   fun printSpiceDetails(){
      println("Spice name: $spiceName")
      println("Spice heat: $heat")
   }
}