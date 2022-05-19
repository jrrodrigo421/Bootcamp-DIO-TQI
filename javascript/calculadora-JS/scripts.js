function calculadora() {
    let operacao = Number(prompt(' Escolha uma Operação: \n 1-SOMA   (+) \n 2-SUBTRAÇÃO   (-) \n 3-MULTIPLICAÇÃO   (*) \n 4-DIVISÃO   (/) \n 5-DIVISÃO INT   (%) \n 6-POTENCIAÇÃO   (**) '));
    if (!operacao || operacao >= 7) {
        alert('ERRO - Operação INVALIDA!')
        calculadora()
    } else {
        let n1 = Number(prompt('Insira o primeiro valor'));
        let n2 = Number(prompt('Insira o segundo valor'));
        let resultado;
        if (!n1 || !n2) {
            alert('Parametro invalido');
            calculadora();
        } else {
            function soma() {
                resultado = n1 + n2;
                alert(`${n1} + ${n2} = ${resultado}`);
                novaOperacao();
        }
            function subtracao() {
                resultado = n1 - n2;
                alert(`${n1} - ${n2} = ${resultado}`);
                novaOperacao();
        }
            function multiplicacao(){
                resultado = n1 * n2;
                alert(`${n1} * ${n2} = ${resultado}`);
                novaOperacao();
        }
            function divisao(){
                resultado = n1 / n2;
                alert(`${n1} / ${n2} = ${resultado}`);
        }
            function divisaoint() {
                resultado = n1 % n2;
                alert(`${n1} e ${n2} é igual a ${resultado}`);
                novaOperacao();
        }
            function potenciacao() {
                resultado = n1 ** n2;
                alert(`${n1} e ${n2} é igual a ${resultado}`);
                novaOperacao();
        }
    
            function novaOperacao() {
                let opcao = prompt('Deseja realizar nova operação ? \n 1 - Sim \n 2 - Não ');
                if (opcao == 1) {
                    calculadora()
                } else if (opcao == 2) {
                    alert('Até mais!')
                } else {
                    alert('digite uma opcao Valida !')
                    novaOperacao();
                }
    
            }
            if (operacao == 1) {
                soma();
            } else if (operacao == 2) {
                subtracao();
            } else if (operacao == 3) {
                multiplicacao();
            } else if (operacao == 4) {
                divisao();
            } else if (operacao == 5) {
                divisaoint();
            } else if (operacao == 6) {
                potenciacao();
            }   
        }
    }
}


        
calculadora();
