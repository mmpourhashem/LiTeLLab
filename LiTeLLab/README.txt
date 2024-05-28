The jar file can be executed by the command "java -jar litellab Path_to_the_OLTL_script.txt". This runs the OLTL specification written in the file.

Alternatively, any of three case studies ("exam", "or", and "al") can be executed by giving the case study name instead of file path.

Z3 should be installed on the machine and the file runZ3.sh should be modified according to the Z3 installation.

Litellab will prodcues the following files:
	oltl.output.txt: The main output that can be UNSAT or a trace with the total amount of cost in the end.
	z3.input.smt2: The smt2 script prodcued to be solved by Z3.
	z3.output.smt2: The model prodcued by Z3.