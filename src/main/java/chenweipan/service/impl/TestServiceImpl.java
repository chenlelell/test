package chenweipan.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chenweipan.po.TbTest;
import chenweipan.repository.TbTestRepository;
import chenweipan.service.TestService;

@Service()
@Transactional
public class TestServiceImpl implements TestService {

	@Autowired
	TbTestRepository tbTestRepository;
	
	public TbTest getOne() {
		// TODO Auto-generated method stub
		return tbTestRepository.findOne(1);
	}

}
