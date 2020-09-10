package br.com.objective.ex1.service;

import br.com.objective.ex1.utils.ConstantsExpression;

public interface NumberProcessService {

    int evaluateNumbersByExpression(ConstantsExpression constantsExpression, int initialStepValue, int finishStepValue);

    boolean evaluateHappyNumber(int number);

}
