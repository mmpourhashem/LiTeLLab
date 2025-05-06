# LiTeLLab

The tool LiTeLLab supports encodings for OLTL OCLTLoc. For OLTL specifications, it initially separates the optimization layer from the temporal layer. Subsequently, the temporal layer, which comprises an LTL formula, is translated into a quantifier-free fixed-size bit-vector logic (QF\_BV) formula, while the optimization layer is translated into Linear Real Arithmetic (LRA). The resulting specification in SMT-LIB 2.0 (SMT2) is then input into Z3, an Optimization Modulo Theories (OMT) solver developed by Microsoft Research. Z3 integrates state-of-the-art optimization algorithms and extends some of these algorithms. The output of Z3, in SMT2 format, is returned to LiTeLLab and presented to the user.

## Getting Started

1. Ensure you have Java installed and [Z3](https://github.com/Z3Prover/z3) configured on your machine. (Note that the path to the installed Z3 must be updated in the runZ3.sh or runZ3.bat files.)
2. Clone the LiTeLLab repository:

   ```bash
   git clone https://github.com/your_org/LiTeLLab.git
   cd LiTeLLab
   ```
3. Build the project (if necessary) or use the provided JAR directly.

## Running OLTL Specifications

Execute the JAR file with the following command:

```bash
java -jar litellab Path_to_the_OLTL_script.txt -k ValueOfK
```

This runs the OLTL specification written in the input file. If parameter `-k` is not provided, LiTeLLab will default to `k = 10`.

• `z3` must be installed on your machine. Adjust the `runZ3.sh` script to point to your Z3 executable.
• Sample models can be found in the `LiTeLLab/Exemplar_Input_Models` directory.

## Outputs

LiTeLLab generates the following files:

* `oltl.output.txt`: The main result, either `UNSAT` or a satisfying trace with the total cost.
* `z3.input.smt2`: The generated SMT2 script sent to Z3.
* `z3.output.smt2`: The model returned by Z3.

## Running OLTL Scalability Analysis

LiTeLLab includes scalability experiments for two case studies: the assembly line and the operating room scheduling. To reproduce these experiments, run the provided `run.sh` scripts in each directory.

1. **Assembly Line Case Study**

   ```bash
   cd OLTL-ScalabilityAnalysis/Assembly_Line
   ./run.sh
   ```

   This script executes all scalability experiments on the assembly line models of various sizes and collects performance metrics.

2. **Operating Room Scheduling Case Study**

   ```bash
   cd OLTL-ScalabilityAnalysis/Operating_Room
   ./run.sh
   ```

   This script executes all scalability experiments on the operating room scheduling models of various sizes and collects performance metrics.

Both `run.sh` scripts will invoke LiTeLLab on each model instance, aggregate results, and produce summary reports in their respective directories.

## Contact

For issues or contributions, please open an issue or pull request on the GitHub repository.
