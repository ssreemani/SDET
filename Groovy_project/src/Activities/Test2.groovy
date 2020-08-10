package Activities

class Test2 {
	public static void main(def args) {
		def mp = [
				  "TopicName" : "Maps",
				  "TopicDescription" : "Methods"
			  		]
	
					//get()
					println(mp.get("TopicName")) // Output: Maps
					println(mp.get("Topic")) // Output: null
			
					//put()
					mp.put("Topic","Testing");
					println(mp); // Output:[TopicName:Maps, TopicDescription:Methods, Topic:Testing]
			 
					//values()
					println(mp.values()); // Output:[Maps, Methods, Testing]
		 
					//keySet()
					println(mp.keySet()) // Output:[TopicName, TopicDescription, Topic]
				
					//size()
					println(mp.size()) // Output: 3

       
	}
}

