package com.example.demo.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("abv","b","desc"),
//			new Topic("c","d","desc1"),
//			new Topic("e","f","desc2")				
//			));
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	
//	public Topic getTopicById(String id) {
////		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		return topicRepository.findById(id);
//	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
//		for(int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);
		
	}

	public void deleteTopicById(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}


}
