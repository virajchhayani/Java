<?php
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ComponentController;

Route::get('/form', [ComponentController::class, 'index']);
Route::post('/form', [ComponentController::class, 'register']);