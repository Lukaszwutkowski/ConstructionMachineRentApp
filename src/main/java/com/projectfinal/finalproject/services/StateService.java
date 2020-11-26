package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.State;
import com.projectfinal.finalproject.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }

    public Optional<State> findById(int id) {
        return stateRepository.findById(id);
    }

    public void delete(int id) {
        stateRepository.deleteById(id);
    }

    public void save(State state) {
        stateRepository.save(state);
    }

    private Map<Integer, State> stateMap;

    public State modifyState(int stateId, State state) {
        state.setId(stateId);
        stateMap.put(stateId, state);
        return state;
    }
}
