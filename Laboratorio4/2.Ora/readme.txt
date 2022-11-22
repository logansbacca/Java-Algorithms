Projete, especifique e implemente uma classe Time que represente uma hora com um valor de horas entre 0 e 23 e minutos entre 0 e 59. Manipule as verificações de valor 
adequadamente usando exceções.

-> Time 
	- horas
	- minutos

Defina os seguintes construtores:

Time() construtor padrão que inicializa um novo Time com a hora e os minutos em 0,

-> Time 
	- horas
	- minutos
	= Time()

Construtor de tempo (int horas, minutos int) que inicializa um novo Time com a hora (no intervalo 0-23), e os minutos fornecidos como parâmetros

-> ...
	= Time(int horas, int minutos) 

Time (int horas, int minutos, boolean PM) que inicializa um novo Time com a hora (no intervalo de 1 a 12), os minutos e um valor booleano que especifica se a hora é 
manhã (false) ou tarde (true) )

-> ...
	= Time(int horas, int minutos, boolean PM)

Defina os seguintes métodos:

int getHours() e int getMinutes() que retornam a hora (0-23) e os minutos avança (int horas, minutos int) que avança o tempo em horas e minutos especificados, 

-> ...
	= getHours()    -> (0-23)
	= getMinutes()	-> (0-59)
	= avanca(int horas, int minutos)

gerenciando adequadamente a mudança de horário
String getOra24() que retorna uma string que representa a hora no formato de 24 horas (hh:mm)

-> ...
	= getOra24()    -> String (hh:mm)

String getOra12() que retorna horas em notação de 12 horas (h: mm xx) onde xx é AM ou PM.

-> ...
	= getOra12()    -> String (h: mm xx)

Além disso, implemente os métodos de Função de Abstração e Invariante de Representação apropriados e redefina o método equals.

-> ...
	= equals(Time time)    -> boolean

Na classe Timetable, implemente um método main() para testar a classe. O método deve ler a hora de início da linha de comando no formato de 24 ou 12 horas, 
conforme especificado nos dois últimos métodos definidos. Se o tempo não for especificado, ele será inicializado em 0 horas e 0 minutos. Então, a partir da entrada 
padrão, você terá que ler uma string no formato + horas minutos e terá que avançar o tempo de acordo. Por fim, a hora deve ser impressa no formato 24h e 12h.