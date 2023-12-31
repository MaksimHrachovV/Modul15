package goit.module151.service;


import goit.module151.note.Note;
import goit.module151.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NoteService {
    private final NoteRepository repository;

    public NoteService(NoteRepository repository) {
        this.repository = repository;
    }


    public Note add(Note note){
           return repository.save(note);
    }
    public List<Note>listAll(){

        return repository.findAll();
    }

    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new NullPointerException("ID not found in base!!!!!");

        }

    }
    public void update(Note note){
        if (repository.existsById(note.getId())) {
            repository.save(note);
        } else {
            throw new NullPointerException("ID not found in base!!!!!");

        }
    }
    public Note getById(Long id){

       return repository.getReferenceById(id);

    }



}
