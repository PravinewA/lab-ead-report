# Lab 1 Theory

## Topic : Git Workflow

A *Git Workflow* is a recipe or recommendation for how to use Git to accomplish work in a consistent and productive manner. Git workflows encourage users to leverage Git effectively and consistently. Git offers a lot of flexibility in how users manage changes.

## Some of the characteristics of git

* **Strong support for non-linear development:**
    Non-linear development allows yourself to work on different parts of a system concurrently. Thus you don’t have to build an app in a specific order.
* **Distributed development:**
    Distributed development allows for multiple people to be working on the same project at the same time. Without version control you would not be able to work on the same file as someone else as one of your changes would overwrite the other’s code when committing.
* **Safeguards:**
    Everything saved in git is accessible at some later point. **Even if you delete it!!** There is always a record of your save history. Thus it is tough to corrupt your code whether it occurs accidentally or maliciously.

![Image of git](https://github.com/PravinewA/lab-ead-report/blob/master/lab1/img/git.png)

### The Working Tree

The Working Tree is the area where you are currently working. It is where your files live. This area is also known as the “untracked” area of git. Any changes to files will be marked and seen in the Working Tree. Here if you make changes and do not explicitly save them to git, you will lose the changes made to your files. This loss of changes occurs because git is not aware of the files or changes in the Working Tree until you tell it to pay attention to them. If you make changes to files in your working tree git will recognize that they are modified, but until you tell git “Hey pay attention to these files,” it won’t save anything that goes on in them.

### The Staging Area

The Staging Area is when git starts tracking and saving changes that occur in files. These saved changes reflect in the .git directory. That is about it when it comes to the Staging Area. You tell git that I want to track these specific files, then git says okay and moves them from you Working Tree to the Staging Area and says “Cool, I know about this file in its entirety.”

### The Local Repository

The Local Repository is everything in your .git directory. Mainly what you will see in your Local Repository are all of your checkpoints or commits.
The git command git commit takes all changes in the Staging Area, wraps them together and puts them in your Local Repository. A commit is simply a checkpoint telling git to track all changes that have occurred up to this point using our last commit as a comparison. After committing, your Staging Area will be empty.

![Image of Workflow](https://github.com/PravinewA/lab-ead-report/blob/master/lab1/img/gitworkflow.png)

## List of Commands used

* **git init** → Create a new git repository
* **git add “newfile”** → Add a new file to your staging area
* **git commit** → Adds staged changes to your local repository
* **git push “remote” “ branch”** → Push local repository changes to your hosting service
* **git pull “remote” “ branch”** → pull code from your hosting service to your local directory
* **git status** → Show which files are being tracked v. untracked
* **git log** → Show recent commit history
