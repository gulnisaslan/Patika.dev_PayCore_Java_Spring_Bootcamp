package com.patikapaycore.project.services.impl;


import com.patikapaycore.project.dtos.request.WriterRequestDto;
import com.patikapaycore.project.dtos.request.WriterUpdateDto;
import com.patikapaycore.project.dtos.response.WriterResponseDto;
import com.patikapaycore.project.models.entities.Writer;
import com.patikapaycore.project.repositories.WriterRepository;
import com.patikapaycore.project.services.abstracts.WriterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class WriterServiceImpl implements WriterService {

    private final WriterRepository writerRepository;
   ModelMapper modelMapper;

    public WriterServiceImpl(WriterRepository writerRepository, ModelMapper modelMapper) {
        this.writerRepository = writerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<WriterResponseDto> getAllWriter() {

        List<Writer> getAll = this.writerRepository.findAll();
        return  getAll.stream()
                .map(writer -> modelMapper.map(writer,WriterResponseDto.class))
                .collect(Collectors.toList());


    }

    @Override
    public WriterResponseDto getByWriterId(Integer id) {
        Writer byId = this.writerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(byId,WriterResponseDto.class);


    }

    @Override
    public Writer getByWriterId1(Integer id) {
        return this.writerRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public WriterResponseDto addWriter(WriterRequestDto writerRequestDto) {
        Writer save = this.writerRepository.save(modelMapper.map(writerRequestDto, Writer.class));
        return modelMapper.map(save,WriterResponseDto.class);
    }
// ToDo: Update method was refactoring

    @Override
    public boolean deleteWriter(Integer id) {
        Writer byId = this.writerRepository.getById(id);
        this.writerRepository.delete(byId);
        return true;
    }

    @Override
    public void updateWriter(WriterUpdateDto writerUpdateDto) {
         Writer byWriterId1 = this.writerRepository.findById(writerUpdateDto.getId()).orElseThrow(()-> new EntityNotFoundException("Yazar bulunamadı"));
         byWriterId1.setWriterName(writerUpdateDto.getWriterName()==null?writerUpdateDto.getWriterName():byWriterId1.getWriterName());
         byWriterId1.setWriterSurname(writerUpdateDto.getWriterSurname()==null ? writerUpdateDto.getWriterSurname():byWriterId1.getWriterSurname());
         Writer saveWriter = this.writerRepository.save(byWriterId1);
         this.writerRepository.save(modelMapper.map(saveWriter,Writer.class));
    }

}
