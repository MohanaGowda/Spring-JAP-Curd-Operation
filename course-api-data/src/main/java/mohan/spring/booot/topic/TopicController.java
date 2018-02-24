package mohan.spring.booot.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics(){
		
		return topicService.getAllTopic();
		
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topic")
	public void addTopic(@RequestBody Topic topics){
		
		 topicService.addTopic(topics);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
	public void updateTopic(@RequestBody Topic topics, @PathVariable String id){
		
		 topicService.updateTopic(topics, id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
	public void deleteTopic(@PathVariable String id){
		
		topicService.deleteTopic(id);
	}
}
