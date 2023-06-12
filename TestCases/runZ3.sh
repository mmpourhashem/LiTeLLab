#!/bin/bash
# !/Users/rossi/z3/z3-4.12.2/bin
ls > oltl.output.txt
/Users/rossi/z3/z3-4.12.2/bin/z3 z3.input.smt2 pp.decimal=true pp.single_line=true -st > z3.output.txt
# open oltl.output.txt
