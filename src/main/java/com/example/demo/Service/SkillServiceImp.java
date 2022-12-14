
package com.example.demo.Service;

import com.example.demo.Entity.Skill;
import com.example.demo.Interface.ISkillService;
import com.example.demo.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImp implements ISkillService{
     
    @Autowired ISkillRepository iskillRepository;
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> skill = iskillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(Skill skill) {
       iskillRepository.save(skill);
    }

    @Override
    public void deleteSkill(int id) {
     iskillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(int id) {
       Skill skill= iskillRepository.findById(id).orElse(null);
       return skill;
}
}
