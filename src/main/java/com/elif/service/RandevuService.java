package com.elif.service;

import com.elif.utility.ICrudService;
import com.elif.entity.Doktor;
import com.elif.entity.Randevu;
import com.elif.exception.ErrorType;
import com.elif.exception.HastaneRandevuException;
import com.elif.repository.RandevuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RandevuService implements ICrudService<Randevu,Long>{

    private final RandevuRepository randevuRepository;

    @Override
    public Randevu save(Randevu randevu) {
        return randevuRepository.save(randevu);
    }

    @Override
    public Randevu update(Randevu randevu) {
        return randevuRepository.save(randevu);
    }

    @Override
    public Iterable<Randevu> saveAll(Iterable<Randevu> t) {
        return randevuRepository.saveAll(t);
    }

    @Override
    public Randevu deleteById(Long id) {
        return null;
    }

    @Override
    public Optional<Randevu> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Randevu> findAll() {
        List<Randevu> randevuList = randevuRepository.findAll();
        if (randevuList.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return randevuList;
    }

    public List<Randevu> findAllByDoktorid(Long id) {
        return randevuRepository.findAllByDoktorid(id);
    }
}
