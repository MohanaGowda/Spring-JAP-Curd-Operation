package mohan.spring.booot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	    
	     public List<Topic> getAllTopic(){
	 		List<Topic> topics= new ArrayList<Topic>();
	 	     topicRepository.findAll().
	 	     forEach(topics::add);
	 	     return topics;
	 	     }

         public Topic getTopic(String id){
		
		return topicRepository.findOne(id);
	    }

         public void addTopic(Topic topics2) {
 			
 			topicRepository.save(topics2);
 		}

		public void updateTopic(Topic topics2, String id) {
			
			topicRepository.save(topics2);
			
		}

		public void deleteTopic(String id) {
		
			topicRepository.delete(id);
		}
	
}
