<template>
  <div>
    <div class="row justify-content-center">
      <div class="col-md-8 toastify-container">
        <h1 id="register-title" data-cy="registerTitle">Registro</h1>

        <div class="alert alert-success" role="alert" v-if="success">
          <strong>Registration saved!</strong> Por favor revise su correo electrónico para confirmación.
        </div>

        <div class="alert alert-danger" role="alert" v-if="error">
          <strong>Registro fallido!</strong> Por favor, inténtelo de nuevo más tarde.
        </div>

        <div class="alert alert-danger" role="alert" v-if="errorUserExists">
          <strong>Nombre de inicio de sesión ya registrado!</strong> Por favor elije otro.
        </div>

        <div class="alert alert-danger" role="alert" v-if="errorEmailExists">
          <strong>Correo electrónico ya está en uso!</strong> Por favor elije otro.
        </div>
      </div>
    </div>
    <div class="row justify-content-center">
      <div class="col-md-8">
        <form id="register-form" name="registerForm" role="form" v-on:submit.prevent="register()" v-if="!success" no-validate>
          <div class="form-group">
            <label class="form-control-label" for="username">Nombre Usuario</label>
            <input
              type="text"
              class="form-control"
              v-model="$v.registerAccount.login.$model"
              id="username"
              name="login"
              :class="{ valid: !$v.registerAccount.login.$invalid, invalid: $v.registerAccount.login.$invalid }"
              required
              minlength="1"
              maxlength="50"
              pattern="^[a-zA-Z0-9!#$&'*+=?^_`{|}~.-]+@?[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
              data-cy="username"
            />
            <div v-if="$v.registerAccount.login.$anyDirty && $v.registerAccount.login.$invalid">
              <small class="form-text text-danger" v-if="!$v.registerAccount.login.required"> Su nombre de usuario es requerido. </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.login.minLength">
                Su nombre de usuario debe tener al menos 1 carácter.
              </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.login.maxLength">
                Su nombre de usuario no puede tener más de 50 caracteres.
              </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.login.pattern">
                Su nombre de usuario solo puede contener letras y dígitos.
              </small>
            </div>
          </div>
          <div class="form-group">
            <label class="form-control-label" for="email">Email</label>
            <input
              type="email"
              class="form-control"
              id="email"
              name="email"
              :class="{ valid: !$v.registerAccount.email.$invalid, invalid: $v.registerAccount.email.$invalid }"
              v-model="$v.registerAccount.email.$model"
              minlength="5"
              maxlength="254"
              email
              required
              data-cy="email"
            />
            <div v-if="$v.registerAccount.email.$anyDirty && $v.registerAccount.email.$invalid">
              <small class="form-text text-danger" v-if="!$v.registerAccount.email.required"> Su correo electrónico es requerido. </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.email.email"> Tu Correo Electrónico es Inválido. </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.email.minLength">
                Su correo electrónico debe tener al menos 5 caracteres.
              </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.email.maxLength">
                Su correo electrónico no puede tener más de 100 caracteres.
              </small>
            </div>
          </div>
          <div class="form-group">
            <label class="form-control-label" for="firstPassword">Nueva contraseña</label>
            <input
              type="password"
              class="form-control"
              id="firstPassword"
              name="password"
              :class="{ valid: !$v.registerAccount.password.$invalid, invalid: $v.registerAccount.password.$invalid }"
              v-model="$v.registerAccount.password.$model"
              minlength="4"
              maxlength="50"
              required
              data-cy="firstPassword"
            />
            <div v-if="$v.registerAccount.password.$anyDirty && $v.registerAccount.password.$invalid">
              <small class="form-text text-danger" v-if="!$v.registerAccount.password.required"> Tu contraseña es requerida. </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.password.minLength">
                Su contraseña debe tener al menos 4 caracteres.
              </small>
              <small class="form-text text-danger" v-if="!$v.registerAccount.password.maxLength">
                Su contraseña no puede tener más de 50 caracteres.
              </small>
            </div>
          </div>
          <div class="form-group">
            <label class="form-control-label" for="secondPassword">Confirmar Nueva contraseña</label>
            <input
              type="password"
              class="form-control"
              id="secondPassword"
              name="confirmPasswordInput"
              :class="{ valid: !$v.confirmPassword.$invalid, invalid: $v.confirmPassword.$invalid }"
              v-model="$v.confirmPassword.$model"
              minlength="4"
              maxlength="50"
              required
              data-cy="secondPassword"
            />
            <div v-if="$v.confirmPassword.$dirty && $v.confirmPassword.$invalid">
              <small class="form-text text-danger" v-if="!$v.confirmPassword.required"> Se requiere su contraseña de confirmación. </small>
              <small class="form-text text-danger" v-if="!$v.confirmPassword.minLength">
                Su contraseña de confirmación debe tener al menos 4 caracteres.
              </small>
              <small class="form-text text-danger" v-if="!$v.confirmPassword.maxLength">
                Su contraseña de confirmación no puede tener más de 50 caracteres.
              </small>
              <small class="form-text text-danger" v-if="!$v.confirmPassword.sameAsPassword">
                ¡La contraseña y su confirmación no coinciden!
              </small>
            </div>
          </div>

          <button type="submit" :disabled="$v.$invalid" class="btn btn-primary" data-cy="submit">Registro</button>
        </form>
        <p></p>
        <div class="alert alert-warning">
          <span>Si desea </span>
          <a class="alert-link" v-on:click="openLogin()">iniciar sesión</a
          ><span
            >, puede probar las cuentas predeterminadas:<br />- Administrador (login="admin" y contraseña="admin") <br />- Usuario
            (login="usuario" y contraseña="usuario").</span
          >
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts" src="./register.component.ts"></script>
