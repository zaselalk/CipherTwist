# Contributing to CipherTwist

Thank you for considering contributing to CipherTwist! We welcome contributions from the community and are grateful for your support.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
  - [Reporting Bugs](#reporting-bugs)
  - [Suggesting Enhancements](#suggesting-enhancements)
  - [Pull Requests](#pull-requests)
- [Development Setup](#development-setup)
- [Coding Standards](#coding-standards)
- [Commit Guidelines](#commit-guidelines)

## Code of Conduct

This project and everyone participating in it is governed by a code of conduct. By participating, you are expected to uphold this code:

- Be respectful and inclusive
- Welcome newcomers and help them get started
- Focus on what is best for the community
- Show empathy towards other community members
- Accept constructive criticism gracefully

## How Can I Contribute?

### Reporting Bugs

Before creating bug reports, please check the existing issues to avoid duplicates. When creating a bug report, include as many details as possible:

**Bug Report Template:**
```
**Describe the bug**
A clear and concise description of what the bug is.

**To Reproduce**
Steps to reproduce the behavior:
1. Go to '...'
2. Click on '...'
3. Enter '...'
4. See error

**Expected behavior**
A clear and concise description of what you expected to happen.

**Screenshots**
If applicable, add screenshots to help explain your problem.

**Environment:**
 - OS: [e.g., Windows 10, macOS 12, Ubuntu 22.04]
 - Java Version: [e.g., JDK 11, JDK 17]
 - Version: [e.g., commit hash or release version]

**Additional context**
Add any other context about the problem here.
```

### Suggesting Enhancements

Enhancement suggestions are welcome! Please provide:

- A clear and descriptive title
- A detailed description of the proposed enhancement
- Explain why this enhancement would be useful
- Provide examples of how it would work
- Consider potential drawbacks or challenges

### Pull Requests

1. **Fork the repository** and create your branch from `main`:
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make your changes**:
   - Write clear, concise code
   - Follow the existing code style
   - Add comments where necessary
   - Update documentation if needed

3. **Test your changes**:
   - Ensure the application compiles without errors
   - Test the encryption and decryption functionality
   - Test the GUI if you made UI changes

4. **Commit your changes**:
   - Use clear and meaningful commit messages
   - Reference any related issues

5. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Open a Pull Request**:
   - Provide a clear title and description
   - Reference any related issues
   - Explain what changes you made and why

## Development Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git
- A Java IDE (optional but recommended): IntelliJ IDEA, Eclipse, or NetBeans

### Setup Steps

1. **Clone your fork**:
   ```bash
   git clone https://github.com/YOUR-USERNAME/CipherTwist.git
   cd CipherTwist
   ```

2. **Add upstream remote**:
   ```bash
   git remote add upstream https://github.com/zaselalk/CipherTwist.git
   ```

3. **Compile the project**:
   ```bash
   cd src
   javac *.java
   ```

4. **Run the application**:
   ```bash
   java Main
   ```

### Keeping Your Fork Updated

```bash
git fetch upstream
git checkout main
git merge upstream/main
```

## Coding Standards

### Java Coding Conventions

- Use **4 spaces** for indentation (no tabs)
- Class names should be in **PascalCase** (e.g., `CipherTwist`)
- Method and variable names should be in **camelCase** (e.g., `encryptText`)
- Constants should be in **UPPER_SNAKE_CASE** (e.g., `MAX_KEY_LENGTH`)
- Use meaningful variable and method names
- Keep methods focused and single-purpose
- Add JavaDoc comments for public methods and classes

### Example:

```java
/**
 * Encrypts the given text using the CipherTwist algorithm.
 * 
 * @param text The plaintext to encrypt
 * @param key The encryption key (integer)
 * @return The encrypted text in binary format
 */
public static String encrypt(String text, int key) {
    // Implementation
}
```

## Commit Guidelines

### Commit Message Format

```
<type>: <subject>

<body>

<footer>
```

### Types

- **feat**: A new feature
- **fix**: A bug fix
- **docs**: Documentation changes
- **style**: Code style changes (formatting, missing semicolons, etc.)
- **refactor**: Code refactoring without changing functionality
- **test**: Adding or updating tests
- **chore**: Maintenance tasks

### Examples

```
feat: Add support for custom binary format output

Implemented a new option to customize the binary output format,
allowing users to choose separators and bit grouping.

Closes #42
```

```
fix: Correct decryption error with special characters

Fixed an issue where special characters were not properly
decoded during the decryption process.

Fixes #38
```

## Review Process

1. All submissions require review before merging
2. Maintainers will review your code for:
   - Code quality and style
   - Functionality and correctness
   - Test coverage
   - Documentation updates
3. Address any requested changes
4. Once approved, a maintainer will merge your PR

## Questions?

If you have questions about contributing, feel free to:
- Open an issue with your question
- Reach out to the maintainers

Thank you for contributing to CipherTwist! 🎉
