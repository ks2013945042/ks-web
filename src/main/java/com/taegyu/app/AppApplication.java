package com.taegyu.app;

import com.taegyu.app.entity.*;
import com.taegyu.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("이태규", "웹 개발자", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous" , "", "anonymous", ""));
		interestsRepository.save(new Interests("통기타"));
		interestsRepository.save(new Interests("드럼"));
		interestsRepository.save(new Interests("유튜브"));
		skillRepository.save(new Skill("Java", 24));
		skillRepository.save(new Skill("html", 10));
		skillRepository.save(new Skill("intelliJ", 3));
		workRepository.save(new Work("WebProgramming 신입", "Kyungsung", "요람에서 천국까지?", "취직하고싶다."));
		workRepository.save(new Work("WebProgramming 신입", "Kyungsung", "요람에서 천국까지?", "돈 벌고싶다."));
	}
}