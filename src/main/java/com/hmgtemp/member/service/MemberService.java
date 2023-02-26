package com.hmgtemp.member.service;

import com.hmgtemp.member.entity.MemberEntity;
import com.hmgtemp.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository repository;

    @Autowired
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Optional<MemberEntity> findOne(String userId) {
        return repository.findByUserid(userId);
    }
}
