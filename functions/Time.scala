class Time(hours: Int, minutes : Int) {
	val asMinutes = hours * 60 + minutes
	
	def minus(that: Time) : Int = {
		this.asMinutes - that.asMinutes
	}
	
	def -(that: Time) : Int =
		minus(that)
}