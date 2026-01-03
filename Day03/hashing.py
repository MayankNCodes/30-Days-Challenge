def generate_hash(input_string):
    '''Generate a hash for the given input string.'''
    import hashlib
    sha_signature = hashlib.sha256(input_string.encode()).hexdigest()
    return sha_signature

def validate_hash(input_string, hash):
    '''Validate whether the given hash corresponds to the given input string.'''
    generated_hash = generate_hash(input_string)
    return generated_hash == hash


if __name__ == '__main__':
    input_string = input('Enter a string to generate a hash: ')
    hash = generate_hash(input_string)
    print('The generated hash is:', hash)
    validation_input = input('Enter a string to validate the hash: ')
    validation_hash = input('Enter the hash to validate: ')
    if validate_hash(validation_input, validation_hash):
        print('The hash is valid.')
    else:
        print('The hash is not valid.')
