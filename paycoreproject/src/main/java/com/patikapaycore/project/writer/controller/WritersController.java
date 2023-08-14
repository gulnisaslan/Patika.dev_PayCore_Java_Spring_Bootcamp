package com.patikapaycore.project.writer.controller;

import com.patikapaycore.project.writer.model.dto.WriterRequestDto;
import com.patikapaycore.project.writer.model.dto.WriterUpdateDto;
import com.patikapaycore.project.writer.model.dto.WriterResponseDto;
import com.patikapaycore.project.writer.service.WriterService;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
@RequestMapping( "/api/writers")
public class WritersController {


    private final WriterService writerService;

    public WritersController(WriterService writerService) {
        this.writerService = writerService;
    }


    @GetMapping(value ="getallwriter")
    public List<WriterResponseDto> getAll(){
        return this.writerService.getAllWriter();
    }
    @GetMapping(value ="/getbywriterid/{id}")
    public WriterResponseDto getById(@PathVariable @Min(1) @Param("{id}") Integer id){

        return  this.writerService.getByWriterId(id);
    }

    @PostMapping(value ="/createwriter",consumes ={"application/json"})
    public WriterResponseDto addWriter(@Valid @RequestBody WriterRequestDto writer){
      return  this.writerService.addWriter(writer);
    }

    @PutMapping(value ="/updatewriter",consumes ={"application/json"})
    public void updateWriter(@Valid @RequestBody WriterUpdateDto writer){
        this.writerService.updateWriter(writer);
    }

    @DeleteMapping(value ="/deletewriter/{id}")
    public boolean deleteWriter(@PathVariable @Min(1) @Param("{id}") Integer id){
        this.writerService.deleteWriter(id);
        return true;
    }





}
