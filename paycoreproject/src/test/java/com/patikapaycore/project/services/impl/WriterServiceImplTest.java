package com.patikapaycore.project.services.impl;

import com.patikapaycore.project.dtos.request.WriterRequestDto;
import com.patikapaycore.project.dtos.response.WriterResponseDto;
import com.patikapaycore.project.models.entities.Writer;
import com.patikapaycore.project.repositories.WriterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.stubbing.OngoingStubbing;
import org.modelmapper.ModelMapper;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class WriterServiceImplTest {
    @Mock
    WriterRepository writerRepository;

    @Mock
    ModelMapper modelMapper;

    @InjectMocks
    WriterServiceImpl  writerServiceImpl;


    @Test
    void getAllWriter() {
        Writer build = Writer
                .builder()
                .id(1)
                .writerName("İsmet")
                .writerSurname("Ozel")
                .build();
        Writer build1 = Writer
                .builder()
                .id(2)
                .writerName("İsmet")
                .writerSurname("Ozel")
                .build();

        List<Writer> allWriter = new ArrayList<>();

        allWriter.add(build);
        allWriter.add(build1);

        when(writerRepository.findAll()).thenReturn(allWriter);

        List<WriterResponseDto> collect = allWriter.stream().map(writer -> modelMapper.map(allWriter, WriterResponseDto.class))
                .collect(Collectors.toList());

        assertEquals(allWriter.size(),collect.size());

    }

    @Test
    void getByWriterId() {
        Integer id = 1;
        Writer build = Writer
                .builder()
                .id(1)
                .writerName("İsmet")
                .writerSurname("Ozel")
                .build();
        Writer build1 = Writer
                .builder()
                .id(2)
                .writerName("Necip fazıl" )
                .writerSurname("kısakurek")
                .build();

        List<Writer> allWriter = new ArrayList<>();

        allWriter.add(build);
        allWriter.add(build1);

        WriterResponseDto map = modelMapper.map(build, WriterResponseDto.class);
        when(writerRepository.findById(id)).thenThrow(new EntityNotFoundException());

        assertEquals(writerRepository.getById(id),map);

    }

    @Test
    void addWriter() {
//        Writer build = Writer.builder().writerName("Namık").writerSurname("Kemal").build();
//        WriterRequestDto map = modelMapper.map(build, WriterRequestDto.class);
//
////        when(writerRepository.save(build)).thenReturn(true);
//        when(writerServiceImpl.addWriter(map)).thenReturn(modelMapper.map(map,WriterResponseDto.class));
//
//        verify(writerRepository, times(1)).save(build);
//

    }

    @Test
    void updateWriter() {
    }

    @Test
    void deleteWriter() {
    }
}