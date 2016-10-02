set smartindent
set autoindent
set tabstop=4
set shiftwidth=4
set noexpandtab

set path=$PWD/src/**
set wildignore+=*.so,*.swp,*.class,build

set backspace=indent,eol,start

noremap <localleader>i :JavaImport<cr>
noremap <leader>d :JavaDocSearch -x declarations<cr>
noremap <cr> :JavaSearchContext<cr>
