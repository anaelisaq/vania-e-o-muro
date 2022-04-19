# vania-e-o-muro
Resolução da questão da prova no curso de Java

Vania e seus amigos estão andando perto de um muro de altura h e não querem que o guarda os perceba. Para conseguir isso, a altura de cada um dos amigos não deve exceder h. Se a altura de uma pessoa for maior que h ela pode se abaixar e com certeza não será notada pelo guarda. A altura da i-ésima pessoa é igual a a i. Considere a largura da pessoa andando normalmente igual a 1, enquanto a largura da pessoa curvada é igual a 2. Os amigos querem falar uns com os outros enquanto caminham, então eles gostariam de andar em uma única fila. Qual é a largura mínima da estrada, para que os amigos possam andar em fila e permanecer sem ser notados pelo guarda?

Entrada: A primeira linha da entrada contém dois inteiros n e h ( 1 ≤ n ≤ 1000 , 1 ≤ h ≤ 1000 ) — o número de amigos e a altura da cerca, respectivamente. A segunda linha contém n inteiros a i ( 1 ≤ a i ≤ 2 h ), o i -ésimo deles é igual à altura da i -ésima pessoa.
Saída: Imprima um único inteiro — a largura mínima válida possível da estrada.
Exemplos
entrada
3 7
4 5 14
saida
4
entrada
6 1
1 1 1 1 1 1
saida
6
entrada
6 5
7 6 8 9 10 5
saida
11

Observação: No primeiro exemplo, apenas a pessoa número 3 deve se abaixar, então a largura necessária é igual a 1 + 1 + 2 = 4.No segundo exemplo, todos os amigos são
curtos o suficiente e ninguém precisa dobrar, então a largura 1 + 1 + 1 + 1 + 1 + 1 = 6 é suficiente.No terceiro exemplo, todas as pessoas devem se curvar, exceto a última. A largura mínima exigida da estrada é igual a 2 + 2 + 2 + 2 + 2 + 1 = 11.
