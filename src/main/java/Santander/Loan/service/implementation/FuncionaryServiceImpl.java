package Santander.Loan.service.implementation;

import Santander.Loan.exception.serviceexception.BusinessException;
import Santander.Loan.model.Funcionary;
import Santander.Loan.reposiroty.FuncionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionaryServiceImpl {

    private final FuncionaryRepository funcionaryRepository;

    @Autowired
    public FuncionaryServiceImpl(FuncionaryRepository funcionaryRepository){
        this.funcionaryRepository = funcionaryRepository;
    }

    public void createFuncionary(Funcionary funcionary) {
        if (funcionaryRepository.existsByCpf(funcionary.getCpf())) {
            throw new BusinessException("CPF já está sendo utilizado.");
        }
        if (funcionaryRepository.existsByEmail(funcionary.getEmail())) {
            throw new BusinessException("E-mail já está sendo utilizado.");
        }
        if (funcionaryRepository.existsByUsername(funcionary.getUsername())) {
            throw new BusinessException("Username já está sendo utilizado.");
        }

        funcionaryRepository.save(funcionary);
    }



//
//    void updateFuncionary(Funcionary funcionary){
//
//    }
//
//    void deleteFuncionary(Long funcionaryId){
//
//    }
//    List<Funcionary> getAllFuncionaries(){
//
//    }
//    Funcionary getFuncionaryById(Long funcionaryId){
//
//    }

}
