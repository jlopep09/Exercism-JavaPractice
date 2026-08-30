class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null){throw new IllegalArgumentException("Operation cannot be null");}
        if (operation == ""){throw new IllegalArgumentException("Operation cannot be empty");}
        switch(operation){
            case "+":
                return operand1+" + "+operand2+" = "+(operand1+operand2);
            case "*":
                return operand1+" * "+operand2+" = "+(operand1*operand2);
            case "/":
                String result = "";
                try{
                    result = operand1+" / "+operand2+" = "+(operand1/operand2);
                }catch(ArithmeticException ae){
                    if(operand2 == 0){
                        throw new IllegalOperationException("Division by zero is not allowed",ae);
                    }        
                }
                return result;
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}
