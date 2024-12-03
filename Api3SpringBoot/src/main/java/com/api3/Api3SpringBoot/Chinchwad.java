package com.api3.Api3SpringBoot;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chinchwad {

	@GetMapping("/tka/pk/{ok}")
	public List<Candidate> Lavendor(@PathVariable("ok") int jcb) {

		if (jcb == 1) {

		Candidate cd1 = new Candidate(1, "Shubham", "4649614646", "Development", "Active", "Bhushan",
				"04/10/2024  02:30", "19/10/2024  06:30", "Rahul", 135);

		return Collections.singletonList(cd1);
		}
		else if (jcb == 2) {
			
			Candidate cd2 = new Candidate(106, "Vaibhav", "8465165149","Testing", "Deactivate","Ansh", "04/10/2024  02:30", "19/10/2024  06:30", "Shivarj", 656);
			
			return Collections.singletonList(cd2);
			
		}
		else if (jcb==3){
			
			Candidate cd3 = new Candidate(565, "Harshal", "5641635165", "Testing", "Active", "28/03/2024 03:78 pm", "Vishal", "22/10/2024 06:36pm", "Rohit", 965);
			
			return Collections.singletonList(cd3);
			
			
		}
		else {
			return Collections.emptyList();
		}

	}

}
