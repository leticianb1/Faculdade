// Declare as variáveis o mais próximo possível de onde serão usadas
private static void readPreferences() {
	InputStream is= null;
	try {
		is= new FileInputStream(getPreferencesFile());
		setPreferences(new Properties(getPreferences()));
		getPreferences().load(is);
	} catch (IOException e) {
		try {
			if (is != null)
			is.close();
		} catch (IOException e1) {
		}
	}
}

// Declare variáveis de controle para loops dentro da estrutura da iteração
public int countTestCases() {
	int count= 0;
	for (Test each : tests)
		count += each.countTestCases();
return count;
}

// Em raros casos pode-se declarar uma variável no início de um bloco ou logo depois de um loop em uma função razoavelmente longa
public void loop() {
	for (XmlTest test : m_suite.getTests()) {
		TestRunner tr = m_runnerFactory.newTestRunner(this, test); // <--
		tr.addListener(m_textReporter);
		m_testRunners.add(tr);
		
		invoker = tr.getInvokers();
		
		for (ITestNGMethod m : tr.getBeforeSuiteMethods()) {
			beforeSuiteMethods.put(m.getMethod(), m);
		}
		
		for (ITestNGMethod m : tr.getAfterSuiteMethods()) {
			afterSuiteMethods.put(m.getMethod(), m);
		}
	}
}

// Deve-se declarar as instâncias de variáveis no início da classe
public class TestSuite implements Test {
	static public Test createTest(Class<? extends TestCase> theClass, String name) {
		...
	}
	
	public static Constructor<? extends TestCase> gettestConstructor(Class<? extends TestCase> theClass throws NoSuchMethodException {
		...
	}
	
	private static Test warning(final String message) {
		...
	}
	
	private static String exceptionToString(Throwable t) {
		...
	}
	private String fname; // <--
	
	private Vector<Test> fTests= new Vector<Test>(10); <--
	
	public TestSuite() {
	}
	
		public TestSuite(final Class<? extends TestCase> theClass) {
			...
		}
	
	public TestSuite(Class<? extends TestCase> theClass, String name) {
		...
	}
	... ... ... ... ...
}

