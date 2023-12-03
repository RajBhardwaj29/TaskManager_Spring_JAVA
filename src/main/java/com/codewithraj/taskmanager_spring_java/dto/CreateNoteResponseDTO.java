package com.codewithraj.taskmanager_spring_java.dto;

import com.codewithraj.taskmanager_spring_java.entities.NoteEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateNoteResponseDTO {
    private Integer taskId;
    private NoteEntity note;

    public CreateNoteResponseDTO(Integer taskId, NoteEntity note) {
    }
}
