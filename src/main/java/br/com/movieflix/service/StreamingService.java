package br.com.movieflix.service;

import br.com.movieflix.entity.Streaming;
import br.com.movieflix.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreamingService {
    final private StreamingRepository streamingRepository;

    public List<Streaming> findAll() {
        return streamingRepository.findAll();
    }

    public Streaming save(Streaming streaming) {
        return streamingRepository.save(streaming);
    }

    public Optional<Streaming> findById(Long id) {
        return streamingRepository.findById(id);
    }

    public void delete(Long id) {
        streamingRepository.deleteById(id);
    }

}
