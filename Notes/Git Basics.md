# Git and Github basics

Git is a Version Control System. Version Control tracks the files and the changes happening to those files over
a period of time. What does it do?
- Track changes over time
- Collaborate with other users
- Rollback to previous versions
- Branch out to test and develop features seperately

## Working with git

### Basic git configuration

```bash
# github username and email
git config --global user.name "<user-name>"
git config --global user.email "<user-email>"

# List configurations
git config --list

# Initialize a git repo
mkdir my_repo
cd my_repo
git init .

# Track files in a git repo
git status

# To add files for tracking
git add <file-name>

# To commit the changes
git commit -m "Commit message"

# View the commit history
git log

# Branching in git
# Check the current branch
git branch

# Create a new brach
git branch <new_branch_name>

# Switch to the new branch
git checkout <new_branch_name>
git switch <new_branch_name>

# Create and switch branch in one go
git checkout -b <new_branch>
git switch -c <new_branch>
```