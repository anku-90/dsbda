scala :
su
cd 
nano wc_count.txt
spark-shell 
val inputfile=sc.textFile("wc_count.txt")
val counts =inputfile.flatMap(line=>line.spilt(" ")).map(word=>(word,1)).reduceByKey(_+_);
val sorted = counts.sortBy(-_._2)
counts.toDebugString
counts.cache();
counts.saveAsTextFile("output")

new window 
su
cd 
cd output
ls 
cat part-00000

programs:
object CheckNumber
{
	def main(args:Array[String])
	{
		var number = (-100);
		if(number==0)
		{
			println("Number is zero");
		}
		else if(number>0)
		{
			println("Number is positive");
		}
		else
		{
			println("Number is negative");
		}
		
	}
}

object Largest
{
	def main(args : Array[String])
	{
		var number1 = 10;
		var number2 = 20;
		if(number1>number2)
		{
			println("NUmber 1 is greater");
		}
		else
		{
			println("NUmber 2 is greater");
		}
	}
}

         
