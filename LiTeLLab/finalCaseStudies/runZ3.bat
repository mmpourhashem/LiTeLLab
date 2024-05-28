::!/bin/bash
:: !/Applications/z3/bin/
:: ls > oltl.output.txt
:: /Applications/z3/bin/z3 z3.input.smt2 pp.decimal=true pp.single_line=true -st > z3.output.txt ::(runZ3.sh) for bash
"C:\Program Files\z3\bin\z3" z3.input.smt2 pp.decimal=true pp.single_line=true -st > z3.output.txt ::(runZ3.bat) for batch
::"C:\Program Files\z3\bin\z3" z3.input.smt2 pp.decimal=true -st > z3.output.txt ::(runZ3.bat) for batch
:: open oltl.output.txt